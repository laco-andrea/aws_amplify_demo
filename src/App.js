import logo from './logo.svg';
import './App.css';
import { ContactForm } from './ui-components';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <ContactForm
          onSubmit={fields => {
          /* Handle form submission */
          }}
        />
      </header>
    </div>
  );
}

export default App;
