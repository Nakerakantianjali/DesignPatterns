package com.company.StructuralPattern.FacadePattern;

public class ShoopKeeper {
    Samsung samsung;
    Vivo vivo;
    public ShoopKeeper() {
        samsung = new Samsung();
        vivo = new Vivo();
    }
    public void getSamsungDetails(){
        System.out.println("Name:"+ samsung.getName()+"\n"+"version"+samsung.getVersion());
        samsung.Features();
    }
    public  void getVivoDetails(){
        System.out.println("Name:"+ vivo.getName()+"\n"+"version"+vivo.getVersion());
        vivo.Features();

    }



}
