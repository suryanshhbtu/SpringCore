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

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double sqrt;

	@Value("#{T(java.lang.Math).PI}")
	private double pi; // also works with string

	@Value("#{new String('Suryansh Srivastava')}")
	private String name;
	
	@Value("#{false}")
	private boolean activate;

	private boolean isActivate() {
		return activate;
	}

	private void setActivate(boolean activate) {
		this.activate = activate;
	}

	private int getX() {
		return x;
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

	private double getSqrt() {
		return sqrt;
	}

	private void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	private double getPi() {
		return pi;
	}

	private void setPi(double pi) {
		this.pi = pi;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", pi=" + pi + ", name=" + name + ", activate="
				+ activate + "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
