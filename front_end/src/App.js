import React from 'react';
import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import HomePage from './components/HomePage/HomePage';
import User from './components/User/User';

function App() {
  return (
    <div className="app">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="user" element={<User />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
