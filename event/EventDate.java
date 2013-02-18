package event;
import java.util.Date;


public class EventDate {
	
	private Date start;
	private Date end;
	
	
	
	



	public EventDate(Date start) {
		super();
		this.start = start;
	}

	

	public EventDate(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
	}



	public Date getStart() {
		return start;
	}



	public void setStart(Date start) {
		this.start = start;
	}



	public Date getEnd() {
		return end;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventDate other = (EventDate) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}



	public void setEnd(Date end) {
		this.end = end;
	}



	@Override
	public String toString() {
		return "EventDate [start=" + start + ", end=" + end + "]";
	}

	
}
