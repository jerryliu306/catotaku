// import { Button, Radio, Icon } from 'antd';

class ts extends React.Component{
    render(){
        return(
            <div>
                <antd.Button type="primary">Primary</antd.Button>
                <antd.Button>Default</antd.Button>
                <antd.Button type="dashed">Dashed</antd.Button>
                <antd.Button type="danger">Danger</antd.Button>
            </div>
        );
    }
}
ReactDOM.render(
    <ts/>
    , document.getElementById('root')
);