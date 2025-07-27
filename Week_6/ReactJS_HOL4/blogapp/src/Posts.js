import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }
    
    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(res => res.json())
        .then(data => {
            const posts = data.map(
                item => new Post(
                    item.userId, 
                    item.id, 
                    item.title, 
                    item.body
                ));
                this.setState({ posts });
            })
        .catch(error => {
            console.error("Error loading posts", error);
            this.setState({ hasError: true });
        });
    };
    
    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.error("Caught error:", error, info);
        alert("Error has occured while rendering the posts.");
        this.setState({ hasError: true });
    }

render() {
    if (this.state.hasError) {
        return <h2>Failed to load posts.</h2>;
    }

    return (
        <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
            <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
        <hr />
        </div>
    ))}
    </div>
    );
}
}

export default Posts;
