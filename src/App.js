import logo from './logo.svg';
import './App.css';
import { NavBarHeader } from './ui-components';
import { ContactUs } from './ui-components';

function App() {
  return (
    <div className="App">
      <NavBarHeader />
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <ContactUs />
      </header>
    </div>
  );
}

export default App;
