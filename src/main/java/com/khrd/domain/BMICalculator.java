package com.khrd.domain;

public class BMICalculator {
	private double normal; //정상
	private double overWeight; //과체중
	private double lowWeight; //저체중
	private double obesity; //비만
	
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public String bmiCalculator(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);
		
		if(result > obesity) {
			return result + " : 비만입니다.";
		}else if(result > overWeight) {
			return result + " : 과체중입니다.";
		}else if(result > normal) {
			return result + " : 정상체중입니다.";
		}else {
			return result + " : 저체중입니다.";
		}
	}
}
