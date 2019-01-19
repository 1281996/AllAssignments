package com.mallika.collections;

public class MovieDetails implements Comparable<MovieDetails> {
String mov_name;

String lead_actor;
String lead_actories;
public MovieDetails(String mov_name,String lead_actor,String lead_actories) {
	// TODO Auto-generated constructor stub
	this.mov_name=mov_name;
	this.lead_actor=lead_actor;

	this.lead_actories=lead_actories;

}
public String getMov_name() {
	return mov_name;
}
public void setMov_name(String mov_name) {
	this.mov_name = mov_name;
}
public String getLead_actor() {
	return lead_actor;
}
public void setLead_actor(String lead_actor) {
	this.lead_actor = lead_actor;
}
public String getLead_actories() {
	return lead_actories;
}
public void setLead_actories(String lead_actories) {
	this.lead_actories = lead_actories;
}
public String toString(){
	return mov_name+ " "+lead_actor+" "+lead_actories;
	
}

@Override
public int compareTo( MovieDetails mov) {
	// TODO Auto-generated method stub
	int compare=mov.lead_actories.compareTo(mov.lead_actories);
	if(compare<0)
	return -1;
	if(compare==0)
		return 0;
	
	return 1;
}
}
