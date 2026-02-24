package in.cg.beans;

public class Subject {
	private String subject;
	public Subject(String subject)
	{
		setSubject(subject);
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString()
	{
		return subject;
	}
}
