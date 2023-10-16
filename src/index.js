import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import reportWebVitals from './reportWebVitals';

import {ThemeProvider} from "@aws-amplify/ui-react";
import "@aws-amplify/ui-react/styles.css";
import studioTheme from './ui-components/studioTheme';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
   <ThemeProvider theme={studioTheme}>
        <App />
    </ThemeProvider>
);

reportWebVitals();
