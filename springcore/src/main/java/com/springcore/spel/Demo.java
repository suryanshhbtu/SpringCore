package com.springcore.spel;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("d")
@Scope("prototype")
public class Demo {

	
	@Value("#{21+12}")
	private int x;

	@Value("#{2<3 ? 44 : 88}")
	private int y;

	private int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
