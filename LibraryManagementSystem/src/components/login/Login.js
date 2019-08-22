import React, { Component } from 'react'
import './Login.css'
import Axios from "axios";

export class Login extends Component {
    constructor(props){
        super(props);
        this.state={
          UserId: '',
          password: '',
          userType:''
        };
      }
      validateForm(){
        return this.state.userId>0 && this.state.password.length>0;
      }
      getAccount(event){
        event.preventDefault();
        Axios.post('http://localhost:8091/auth',null,
        {
          params:{
            userId:this.state.userId,
            password:this.state.password,
            userType:this.state.userType
          }
    
        } ).then((response)=>{
            console.log("Response object",response.data);
            console.log(JSON.stringify(response.data));
            console.log(JSON.stringify(response.data.userBeans[0]));
            localStorage.setItem("empdata",JSON.stringify(response.data.userBeans[0]));
            //debugger
            if(this.state.userType==='user'){
            this.props.history.push('/userhome');
            }
            else if(this.state.userType==='admin'){
              this.props.history.push('/adminhome');
            }
            else{
              this.props.history.push('/librarianhome');
            }
    }).catch((error)=>{
      alert("Invalied Credentials!!")
        console.log('Error',error)
        })
    }


    render() {
        return (
            <div className="login-wrap">
          
            <div className="login-html">
            
            <form className="form-signin" onSubmit={this.getAccount.bind(this)} method="post" >
            <h2 id="title"><b>Halifax Central Library</b></h2>
              <input id="tab-1" type="radio" name="tab" className="sign-in" defaultChecked /><label htmlFor="tab-1" className="tab">Sign In</label>
              <input id="tab-2" type="radio" name="tab" className="sign-up" /><label htmlFor="tab-2" className="tab">Sign Up</label>
              <div className="login-form">
                <div className="sign-in-htm">
                <label htmlFor="user" className="label" >User Type</label>
                <select className="label group input"  onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType} type="text" name="userType" > 
                      <option selected="selected" value="user">user</option>
                      <option value="admin">admin</option>
                     <option value="librarian">librarian</option>
                </select>
                  <div className="group">
                    <label htmlFor="user" className="label">UserID</label>
                    <input id="user" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId}  type="text" className="input" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label">Password</label>
                    <input id="pass" type="password"  onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} className="input" data-type="password" />
                  </div>
                  
                  <div className="group">
                    <input id="check" type="checkbox" className="check" defaultChecked />
                    <label htmlFor="check"><span className="icon" /> Keep me Signed in</label>
                  </div>
                  <div className="group">
                    <input type="submit" className="button" defaultValue="Sign In" />
                  </div>
                  <div className="hr" />
                  <div className="foot-lnk">
                    <a href="#forgot">Forgot Password?</a>
                  </div>
                </div>
                
              </div>
              </form>
            </div>
     
      
          </div>
        )
    }
}

export default Login
