import logo from './logo.svg';
import './App.css';
import { ContactUs } from './ui-components';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <ContactUs />
      </header>
    </div>
  );
}

export default App;
