package com.service.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 *  基于restful风格的webservice，客户端与服务端之间通讯可以传递xml数据、json数据
 *  @XmlRootElement 指定对象序列化为xml或json数据时根节点的名称
 *  xml:
 *       <User>
 *           <id></id>
 *           <username></username>
 *           <city></city>
 *       </User>
 *   json:
 *   {"User":  {"id":100,  "username":"jack","city":"广州" }}
 *
 */
@XmlRootElement(name = "User")
public class User {
	private Integer id;
	private String username;
	private String city;

	private List<Car> cars = new ArrayList<Car>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", city=" + city + ", cars=" + cars + "]";
	}

}
