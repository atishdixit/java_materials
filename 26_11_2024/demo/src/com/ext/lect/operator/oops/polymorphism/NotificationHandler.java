package com.ext.lect.operator.oops.polymorphism;

import java.util.Locale;

public class NotificationHandler implements NotificationHandlerIntr{

    private String plateForm;

    @Override
    public void sent(Message message) {
        if(plateForm!=null){
            prepareMessage(message, plateForm);
        } else{
            prepareMessage(message);
        }


        System.out.println("Sending...."+ message);
    }

    private void prepareMessage(Message message){
        message.setMessage(message.getMessage().replace("{name}", message.getName()));
    }


    private void prepareMessage(Message message, String plateForm){
        prepareMessage(message);
        System.out.println("Prepared Message for Platform "+ plateForm);

    }

    @Override
    public void setPlateForm(String plateForm) {
        this.plateForm =  plateForm;

    }
}
