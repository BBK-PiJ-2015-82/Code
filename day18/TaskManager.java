import java.util.*;

public class TaskManager implements Executor {
	
  // private Queue<Runnable> tasks = new ArrayDeque<Runnable>();

	public void execute(Runnable command) {
		command.run();
	}



}