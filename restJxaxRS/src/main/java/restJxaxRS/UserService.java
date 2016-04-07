package restJxaxRS;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restJxaxRS")
public class UserService {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Users> getUsers() {
		Users u = new Users();
		List<Users> users = new ArrayList<Users>();
		users.add(u);
		return users;
	}

}
