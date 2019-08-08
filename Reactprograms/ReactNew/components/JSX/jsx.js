
// const name='Rechu';
// const element=<h1>{name}</h1>


// function  Welcome(props) {
//     return(
//         <div>
//         {/* ADDING COLOR TO THE TEXT */}
//         <h1 style={{color:'orange'}}>{props.name}</h1>
//         {/* ADDING BUTTON */}
//         {/* <button onClick={()=>alert('A Alert Message')}>Click</button> */}
//         <button onClick={alert.bind(this,'This is a button')}>Click</button>
//         </div>
//     )
// }

//using class
class Message extends React.Component{
    constructor(props){
    super(props)
    this.state={
        name : 'Rechu'
    }
    this.ChangeMessage=this.ChangeMessage.bind(this);
    this.clickLink=this.clickLink.bind(this);
}
    render(){
        console.log('rendering')
        return(
            <div>
                <h1 style={{color:'cyan'}}>{this.state.name}</h1>
                <h2>Render</h2>
                <button onClick={this.ChangeMessage}>Change Message</button>
                <a href="https:www.gmail.com" onClick={this.clickLink}>Click The Link</a>
            </div>
        )
    }
clickLink(){
event.preventDefault();

}


    ChangeMessage(){
      console.log('change mesage method')
      //this.state.name
        this.setState({
            name : 'sree'
        })
    }
}

// ReactDOM.render(<Welcome name="Rechu" />,
// document.getElementById('app'));
ReactDOM.render(<Message/>,
document.getElementById('app'));