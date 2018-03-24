package Lvl4._04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> docs;
	ArrayList<Patient> pat;
	
	public Hospital() {
		docs = new ArrayList<Doctor>();
		pat = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor d) {
		docs.add(d);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return docs;
	}
	
	public void addPatient(Patient p) {
		pat.add(p);
	}
	
	public ArrayList<Patient> getPatients(){
		return pat;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int i = 0;
		for(Doctor d: docs) {
			System.out.println(1);
			for(int j = i; j<Math.min(pat.size(), i+3); j++)
				d.assignPatient(pat.get(j));
			i+=3;
		}
	}
}