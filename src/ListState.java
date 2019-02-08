import org.apache.log4j.Logger;

public class ListState extends State {
	static Logger logger = Logger.getLogger(ListState.class);
	
	private Mediator med;
	
	public ListState(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void add() {
		med.addList();

		logger.debug("adding a list");
	}
	
	@Override
	public void remove() {
		med.removeList();
	}
}
