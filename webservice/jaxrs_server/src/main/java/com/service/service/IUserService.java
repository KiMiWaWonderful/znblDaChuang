package com.service.service;

import java.util.List;
import com.service.entity.User;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



//  访问当前服务接口对应的路径
@Path("/userService")
@Produces("*/*")  // 服务器支持的返回的数据格式类型
public interface IUserService {

	// 表示处理的请求的类型，post 对应的是insert新增操作
	@POST
	// 访问当前服务接口方法对应的路径。 【.../userService/user】
	@Path("/user")
	//  服务器支持的请求的数据格式类型
	@Consumes({ "application/xml", "application/json" })
	public void saveUser(User user);

	// 表示处理的请求的类型，put 对应的是update修改操作
	@PUT
	@Path("/user")
	@Consumes({ "application/xml", "application/json" })
	public void updateUser(User user);

	// 表示处理的请求的类型，get 对应的是查询修改操作
	@GET
	@Path("/user")
	// 服务器支持的返回的数据格式类型
	@Produces({ "application/xml", "application/json" })
	public List<User> findAllUsers();

	@GET
	@Path("/user/{id}")
	@Consumes("application/xml")
	@Produces({ "application/xml", "application/json" })
	public User finUserById(@PathParam("id") Integer id);

	// 表示处理的请求的类型，delete 对应的是删除操作
	@DELETE
	@Path("/user/{id}")
	@Consumes({"application/xml", "application/json"})
	public void deleteUser(@PathParam("id") Integer id);
}
