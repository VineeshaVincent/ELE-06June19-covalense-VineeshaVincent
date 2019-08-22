import React, { Component } from 'react'
import './CreateAccount.css'
export class CreateAccount extends Component {
    Create(event){
        this.props.history.push('/createaccount');
    }
    render() {
        return (

            <div className="registration">
              <form onSubmit={this.Create.bind(this)} method="post" >
                  <h1>Registration</h1>
                <label>Name</label>
                <input type="text" />
                <br></br>
                <label>Gender</label>
                <input type="text" />
                <br></br>
                <label>Email</label>
                <input type="text" />
                <br></br>
                <label>User Id</label>
                <input type="text" />
                <br></br>
                <label>Password</label>
                <input type="text" />
                <br></br>
                <label>Phone Number</label>
                <input type="text" />
                <br></br>
                <div className="register_button">
                  <span><a href="#">REGISTER</a></span>
                </div>
              </form>
            </div>
          );
    }
}

export default CreateAccount
