package com.thanhnguyen.CarAccessories.Login;

public class PresenterLogic implements PresenterImpLogic{
    private ViewLoginImp viewLoginImp;
    public PresenterLogic(ViewLoginImp viewLoginImp){
        this.viewLoginImp = viewLoginImp;
    }
    @Override
    public void login(String email, String pass) {
        if(email.equals("thanhnguyen") && pass.equals("1")){
            this.viewLoginImp.Success("Thành công");
        }else {
            this.viewLoginImp.Fail("Fail");
        }
    }
}
