function Header(props1){
    console.log(props1);
    return React.createElement('h1',null,'Header');
}
function Footer(){
    return React.createElement('h1',null,'Footer');
}
function Content(){
    return React.createElement('p',null,'Content');
}
const header = React.createElement(Header,{item:['bag']});
const footer = React.createElement(Footer);
const content = React.createElement(Content);
const myApp  = React.createElement('div',null,header,header,footer,content,content);

 ReactDOM.render(myApp,document.getElementById('app'));