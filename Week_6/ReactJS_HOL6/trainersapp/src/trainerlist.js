import React from 'react';
import { Link } from 'react-router-dom';

function TrainerList({trainers}) {
    return (
        <div>
        <h2>Trainers List</h2>
        <ul>
        {trainers.map((trainer) => (
        <li key={trainer.TrainerID}>
            <Link to={`/trainers/${trainer.TrainerID}`}>{trainer.Name}</Link>
        </li>
        ))}
        </ul>
    </div>
    );
}

export default TrainerList;
