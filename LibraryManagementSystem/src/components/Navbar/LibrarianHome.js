import React, { Component } from 'react'
import './LibrarianHome.css';
export class LibrarianHome extends Component {
    render() {
        return (
<div>
            <ul>
              <li><a href="#home" className="active">Home</a></li>
              <li><a href="#insertbook">Add book</a></li>
              <li><a href="#logout">Logout</a></li>
              
            </ul>
                <div>
                  {/* The sidebar */}
                  <div className="sidebar">
                    <a className="" href="#allottbook">AllottBook</a>
                    <a href="#return">ReturnBook</a>
                    <a href="#allotedbook">AllotedBook</a>
                    <a href="#request">Request</a>
                  </div>
                  
                </div>
                </div>
          );
         
    }
}

export default LibrarianHome
