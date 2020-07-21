package b;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private int id;
	private int volume;

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
