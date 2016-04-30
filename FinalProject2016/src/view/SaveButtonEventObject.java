package view;

import java.util.EventObject;

public class SaveButtonEventObject extends EventObject {
	private String name;
	private String id;
	
	public SaveButtonEventObject(Object source) {
		super(source);
	}

	public SaveButtonEventObject(Object source, String name, String id) {
		super(source);
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
}