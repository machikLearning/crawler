package kr.ac.cbnu.ubigame.analyser.webdata;


import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.ac.cbnu.ubigame.analyser.common.datatype.MapperData;
import kr.ac.cbnu.ubigame.analyser.common.datatype.NonPressDatatype;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;
import kr.ac.cbnu.ubigame.analyser.common.mybatis.Mybatis;
import kr.ac.cbnu.ubigame.analyser.common.webdata.IWebDataDao;

public class WebDataDao implements IWebDataDao {
	private SqlSessionFactory sqlSessionFactory;
	private int overrapCount;
	
	public WebDataDao(){
		this.sqlSessionFactory = Mybatis.getSqlSessionFactory();
		this.overrapCount = 0;
	}
	
	public void add(WebDatatype webDatatype)  throws Exception {
		SqlSession session = this.sqlSessionFactory.openSession(true);
		try{
			session.insert("Article.InsertArticle",webDatatype);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

	@Override
	public void addAssociationData(MapperData mapperData) {
		// TODO Auto-generated method stub
		SqlSession session = this.sqlSessionFactory.openSession(true);
		try{
			session.insert("Mapper.InsertMapper",mapperData);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

	@Override
	public int checkOverlapData(WebDatatype webDatatype) {
		SqlSession session = this.sqlSessionFactory.openSession(true);
		int articleID = 0;
		try{
			articleID = session.selectOne("Article.associationWord", webDatatype);
		}catch(Exception e){
			articleID = 0;
		}finally{
			session.close();
		}
		return articleID;
	}

	@Override
	public int ignoreDataInsert(WebDatatype data) {
		// TODO Auto-generated method stub
		int num = 0;
		SqlSession session = this.sqlSessionFactory.openSession(true);
		try{
			num = (int)session.insert("Article.ignoreDataInsert",data);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return num;
	}

	@Override
	public void addNonPress(NonPressDatatype nd) {
		// TODO Auto-generated method stub
		SqlSession session = this.sqlSessionFactory.openSession(true);
		try{
			session.insert("NonPress.insertNonPressData", nd);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void modifyNonPressDatatype(NonPressDatatype nd) {
		// TODO Auto-generated method stub
		SqlSession session = this.sqlSessionFactory.openSession(true);
		try{
			session.insert("NonPress.modifyData", nd);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
	}

	@Override
	public int getID(String targetURL) {
		// TODO Auto-generated method stub
		SqlSession session = this.sqlSessionFactory.openSession(true);
		int num = -1;
		try{
			num =  (int)session.selectOne("Article.getId",targetURL);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return num;
		
	}

	@Override
	public void add(List<WebDatatype> list) {
		// TODO Auto-generated method stub
		SqlSession session = this.sqlSessionFactory.openSession(true);
		try{
			session.insert("Article.InsertArticle",list);
		}catch(PersistenceException e){
			this.overrapCount ++;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public int getOverrapedCount() {
		// TODO Auto-generated method stub
		return this.overrapCount;
	}


}
