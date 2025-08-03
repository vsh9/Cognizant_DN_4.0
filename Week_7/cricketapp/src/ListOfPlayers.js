import React from "react";

const ListOfPlayers = () => {
    const players=[
        {name: "Sachin", score: 100},
        {name: "Rahul", score: 200},
        {name: "Dravid", score: 300},
        {name: "Kohli", score: 400},
    ];
    return(
        players.map((item) => {
            return (
                <div>
                    <ul>Mr.{item.name}<span>{item.score}</span></ul>
                </div>
            );
        })
    );
};

export default ListOfPlayers;