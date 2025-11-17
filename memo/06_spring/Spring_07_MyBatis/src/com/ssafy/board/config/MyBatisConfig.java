package com.ssafy.board.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory factory;
	
	static {
		//factory 건설
		//설정파일 경로
		String resource = "mybatis-config.xml";
		//설정파일을 읽을 inputstream하나 만들어야 한다. -> close()
		try(InputStream inputStream = Resources.getResourceAsStream(resource)){
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("공장 건설 성공!");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("공장 건설 실패");
		}
		
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
	
}
