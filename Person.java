package com.addressbooksystem;

    public class Person {
		private String fname;
		private String lname;
		private String city;
		private String state;
		private long zip;
		private long phonenum;
		private String email;
	
		Person(){
	
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public long getZip() {
			return zip;
		}
		public void setZip(long zip) {
			this.zip = zip;
		}
		public long getPhonenum() {
			return phonenum;
		}
		public void setPhonenum(long phonenum) {
			this.phonenum = phonenum;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	

}
