package kodlamaio;

import kodlamaio.dataAccess.IInstructerDao;
import kodlamaio.loggers.ILogger;

public class InstructorManager {

	private IInstructerDao instructorDao;
	private ILogger[] loggers;
	private Instructors[] instructors;

	public InstructorManager(IInstructerDao instructorDao, ILogger[] loggers, Instructors[] instructors) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}
	
	public void addInstructor(Instructors instructor) throws Exception {
		for(Instructors currentInstructor : instructors) {
			if(currentInstructor != instructor) {
				if((currentInstructor.getInstructorId()).equals(instructor.getInstructorId()) ) {
					throw new Exception("Eğitmen Id'si aynı olamaz !!!");
				}
			}
		}
	}
}
