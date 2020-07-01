package com.board.web.enums;

public enum Sql {
	CREATE_DB,
	CREATE_MEMBERS, DROP_MEMBERS, TRUNCATE_MEMBERS,
	CREATE_PICNIC, DROP_PICNIC, TRUNCATE_PICNIC;
	
	@Override
	public String toString() {
		String result = "";
		switch(this) {
		case CREATE_DB :
			result = "create database mariadb";
			break;
			
		case CREATE_MEMBERS:
			result = "create table members(memberid varchar(30) primary key,"
					+ "password varchar(30),"
					+ "membername varchar (10),"
					+ "email varchar (30)ENGINE=InnoDB DEFAULT CHARSET=UTF8";
			break;
		case DROP_MEMBERS:
			result = "drop table members";
			break;
		case TRUNCATE_MEMBERS:
			result = "truncate table members";
			break;
			
		case CREATE_PICNIC:
			result = "create table picnics(station_name varchar(30) primary key,"
					+ "road_address varchar(30),"
					+ "branch_address varchar(30),"
					+ "latitue varchar(20),"
					+ "hardness varchar (20),"
					+ "rentable varchar (20),"
					+ "standnum varchar (20) ENGINE=InnoDB DEFAULT CHARSET=UTF8";
			break;
		case DROP_PICNIC:
			result = "drop table picnic";
			break;
		case TRUNCATE_PICNIC:
			result = "truncate table picnic";
			break;
		}
		return result;
	}
	
}
