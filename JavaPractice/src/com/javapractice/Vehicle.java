package com.javapractice;

public class Vehicle {

		private String company, color, fueltype;

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getFueltype() {
			return fueltype;
		}

		public void setFueltype(String fueltype) {
			this.fueltype = fueltype;
		}

		@Override
		public String toString() {
			return "vehicle [company=" + company + ", color=" + color + ", fueltype=" + fueltype + "]";
		}
		
		
	}
}
