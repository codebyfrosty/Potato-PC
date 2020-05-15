/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potatopc;

/**
 *
 * @author User
 */
public class info {
    private String GPU;
    private String CPU;
    private int RAM;
    
    public void setGPU(String GPU) {
this.GPU = GPU;
}
public void setCPU(String CPU) {
this.CPU = CPU;
}
public void setRAM(int RAM) {
this.RAM = RAM;
}

public String getGPU(){
return GPU;
}
public String getCPU(){
return CPU;
}
public int getRAM(){
return RAM;
}
}
