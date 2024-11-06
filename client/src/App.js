#app.js
import React, { useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import { Routes, Route, Navigate } from 'react-router-dom';
import Login from './controller/Login';
import Home from './controller/Home';


function App() {
    const isAuthenticated = !!localStorage.getItem('token');
    const navigate = useNavigate();

    useEffect(() => {
      const token = localStorage.getItem('token');
      if (!token) {
          navigate('/');
      }
  }, [navigate]);

    return (
        <Routes>
            <Route path="/" element={isAuthenticated ? <Navigate to="/home" /> : <Login />} />
            <Route path="/home" element={isAuthenticated ? <Home /> : <Navigate to="/" />} />
        </Routes>
    );
}

export default App;