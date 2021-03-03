/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocanon.Controllers;

import chocanon.Models.Member;
import chocanon.Views.MemberView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jakeb
 */
public class MemberController{
    private Member[] model = new Member[20]; //Max query of 20 members at a time.
    private MemberView view = new MemberView();
    
    public MemberController(){
        this.view.setVisible(true);
        view.setSearchButtonListener(new SearchListener());
    }

    //Setters for Model
    public void setMemberFirstName(String firstName){
        //this.model.setFirstName(firstName);
    }
    
    //Setters for View
    public void updateView(){
        
    }
    
    //Inner Classes
    class SearchListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = view.getUserInput();
            if(userInput.equals("")){
                view.showMessageBox("Please provide search input");
            }else{
                System.out.println(userInput);
            }
        }
    }
    
}
