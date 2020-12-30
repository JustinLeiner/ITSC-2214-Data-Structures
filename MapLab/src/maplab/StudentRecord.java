/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

/**
 * @version Spring 2019
 * @author Kyle
 */
public class StudentRecord {

    private String firstName;
    private String lastName;
    private int studentID;

    /**
     * Default Constructor
     */
    public StudentRecord() {
        firstName = null;
        lastName = null;
        studentID = 0;
    }

    /**
     * Constructor
     *
     * @param firstName first name
     * @param lastName last name
     * @param studentID ID number
     */
    public StudentRecord(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    /**
     * Getter
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter
     *
     * @param firstName set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter
     *
     * @param lastName set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter
     *
     * @return studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Setter
     *
     * @param studentID set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public int hashCode() {
        return (studentID + firstName.length() + lastName.length()) * 7;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Record: ").append(this.getFirstName()).append(" ").append(this.getLastName());
        sb.append(" has a key value of: ").append(this.hashCode());
        return sb.toString();
    }
}
