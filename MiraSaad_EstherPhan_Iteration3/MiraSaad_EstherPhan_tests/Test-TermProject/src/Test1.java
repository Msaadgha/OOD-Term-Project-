import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;



class Test1 {

	@Test
	void getInstance() {
		assertFalse(false);
	}
	
	@Test
	ArrayList<TravelAgent> getAgentList() {
		assertFalse(false);
		return null;
	}
	
	@Test
	void testAgentListContainsData() {
		@SuppressWarnings("unused")
		AgentList agentlist = AgentList.getInstance();
		Test1 agentList = null;
		@SuppressWarnings("null")
		ArrayList<TravelAgent> agents = agentList.getAgentList();
		assertNotNull(agents);
		assertFalse(agents.isEmpty());
	}
	}


