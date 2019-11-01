/**
* #########################################################
* ##################### Bad Example #######################
* #########################################################
*/
// interface segregation principle - bad example
interface IWorker {
	public void work();
	public void eat();
}

class Worker implements IWorker{
	public void work() {
	    // ....working
	}
	public void eat() {
	    // ...... eating in launch break
	}
}

class SuperWorker implements IWorker{
	public void work() {
	    //.... working much more
	}
	public void eat() {
	    //.... eating in launch break
	}
}

class Manager {
	IWorker worker;

	public void setWorker(IWorker w) {
	    worker=w;
	}
	public void manage() {
	    worker.work();
	}
}

/**
* #########################################################
* ##################### Good Example ######################
* #########################################################
*/
// interface segregation principle - good example
interface IWorker extends Feedable, Workable {
}

interface IWorkable {
	public void work();
}

interface IFeedable{
	public void eat();
}

class Worker implements IWorkable, IFeedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
}

class Robot implements IWorkable{
	public void work() {
		// ....working
	}
}

class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}

class Manager {
	Workable worker;

	public void setWorker(Workable w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}