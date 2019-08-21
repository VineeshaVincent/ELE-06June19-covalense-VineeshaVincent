import React, { Component } from 'react'
import './Login.css'
import Axios from "axios";
export class Login extends Component {
    constructor(props){
        super(props);
        this.state={
          UserId: '',
          password: ''
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
            password:this.state.password
          }
    
        } ).then((response)=>{
            console.log("Response object",response.data);
            console.log(JSON.stringify(response.data));
            console.log(JSON.stringify(response.data.userBeans[0]));
            localStorage.setItem("empdata",JSON.stringify(response.data.userBeans[0]));
            //debugger
            this.props.history.push('/userhome');
    }).catch((error)=>{
        console.log('Error',error)
        })
    }


    render() {
        return (
            <div className="login-wrap">
            <div className="login-html">
            <form className="form-signin" onSubmit={this.getAccount.bind(this)} method="post" >
              <input id="tab-1" type="radio" name="tab" className="sign-in" defaultChecked /><label htmlFor="tab-1" className="tab">Sign In</label>
              <input id="tab-2" type="radio" name="tab" className="sign-up" /><label htmlFor="tab-2" className="tab">Sign Up</label>
              <div className="login-form">
                <div className="sign-in-htm">
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
                <div className="sign-up-htm">
                  <div className="group">
                    <label htmlFor="user" className="label">UserID</label>
                    <input id="user" type="text" className="input" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label"> Name </label>
                    <input id="pass" type="text" className="input" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label"> Gender </label>
                    <input id="pass" type="text" className="input" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label">Password</label>
                    <input id="pass" type="password" className="input" data-type="password" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label">Confirm Password</label>
                    <input id="pass" type="password" className="input" data-type="password" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label">Email Address</label>
                    <input id="pass" type="text" className="input" />
                  </div>
                  <div className="group">
                    <label htmlFor="pass" className="label">phone Number</label>
                    <input id="pass" type="Number" className="input" />
                  </div>
                  <div className="group">
                    <input type="submit" className="button" defaultValue="Sign Up" />
                  </div>
                  <div className="hr" />
                  <div className="foot-lnk">
                    <label htmlFor="tab-1">Already Member?
                    </label></div>
                </div>
              </div>
              </form>
            </div>
      
          </div>
        )
    }
}

export default Login
