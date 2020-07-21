package b;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Engine {

	private int id;
	private int volume;
	
	public Engine() {
		System.out.println("from Engine CTOR");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", volume=" + volume + "]";
	}

}
