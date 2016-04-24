package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import javax.persistence.*;

@Entity 
@Table(name="users")
public class User {
	@Id 
        @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public String full_name;
        public String user_name;
        public String user_pwd;
        public String department;
        public String status;
}
