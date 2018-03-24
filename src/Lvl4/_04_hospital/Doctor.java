package Lvl4._04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> pat;
	
	public Doctor() {
		pat = new ArrayList<Patient>();
	}
	
	public Object performsSurgery() {
		return false;
	}

	public Object makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient p) throws DoctorFullException {
		if(pat.size()>2)
			throw new DoctorFullException();
		pat.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return pat;
	}

	public void doMedicine() {
		for(Patient p: pat) {
			p.checkPulse();
		}
	}
}
