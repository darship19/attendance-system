import React from 'react';
import Logout from '../components/Logout';
import './Home.css'; 

function Home() {
    // Retrieve the username from local storage
    const username = localStorage.getItem('username');

    return (
        <div className="home-container">
            <div className="home-box">
                <Logout />
                <div style={{ padding: '20px' }}>
                    <h1>Welcome to the Home page</h1>
                    <h2>Your Attendance is marked</h2>
                    {username && <h2>Welcome to the home page, {username}!</h2>}
                </div>
            </div>
        </div>
    );
}

export default Home;
