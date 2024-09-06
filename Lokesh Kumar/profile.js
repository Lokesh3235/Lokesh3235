/*============= Typing animations ================*/
document.addEventListener('DOMContentLoaded', function(){
    var typed = new Typed('.typing', {
        strings:["", "Backend Dev", "Backend Developer", "Web Developer", "Graphic Designer", "YouTuber"],
        typeSpeed:100,
        backSpeed:60,
        loop:true,
        // showCursor: false
    });
});

/*==============download CV button url =============*/

document.getElementById('downloadBtn').addEventListener('click', function(event) {
    event.preventDefault();
    window.location.href = 'https://www.w3schools.com/js/';
});



// document.addEventListener('DOMContentLoaded', () => {
//     // Get all the links in the navigation
//     const navLinks = document.querySelectorAll('.aside .nav li a');

//     // Add click event listener to each link
//     navLinks.forEach(link => {
//         link.addEventListener('click', function(event) {
//             event.preventDefault();
            
//             // Remove 'active' class from all links
//             navLinks.forEach(link => link.classList.remove('active'));
            
//             // Add 'active' class to the clicked link
//             this.classList.add('active');
//         });
//     });
// });



// function handleLinkClick(event) {
//     // Remove 'active' class from all links
//     document.querySelectorAll('.aside .nav li a').forEach(link => link.classList.remove('active'));
    
//     // Add 'active' class to the clicked link
//     this.classList.add('active');
// }

// // Adding event listeners to each link
// document.querySelectorAll('.aside .nav li a').forEach(link => {
//     link.addEventListener('click', handleLinkClick);
// });

// // Ensure the page scrolls to the correct section
// window.addEventListener('hashchange', function() {
//     const activeLink = document.querySelector('.aside .nav li a[href="' + window.location.hash + '"]');
//     if (activeLink) {
//         document.querySelectorAll('.aside .nav li a').forEach(link => link.classList.remove('active'));
//         activeLink.classList.add('active');
//     }
// });

// // Scroll to section if URL has a hash on load
// if (window.location.hash) {
//     const initialActiveLink = document.querySelector('.aside .nav li a[href="' + window.location.hash + '"]');
//     if (initialActiveLink) {
//         initialActiveLink.classList.add('active');
//         document.querySelector(window.location.hash).scrollIntoView();
//     }
// }




document.addEventListener('DOMContentLoaded', () => {
    const navLinks = document.querySelectorAll('.aside .nav li a');
    const sections = document.querySelectorAll('.section');

    function handleLinkClick(event) {
        event.preventDefault();
        
        // Remove 'active' class from all links
        navLinks.forEach(link => link.classList.remove('active'));
        
        // Add 'active' class to the clicked link
        this.classList.add('active');
        
        // Hide all sections
        sections.forEach(section => section.classList.add('hidden'));
        
        // Get the target section ID from the link's href attribute
        const targetSection = document.querySelector(this.getAttribute('href'));
        
        // Show the target section
        targetSection.classList.remove('hidden');
    }

    // Adding event listeners to each link
    navLinks.forEach(link => {
        link.addEventListener('click', handleLinkClick);
    });

    // Ensure the page shows the correct section if there's a hash in the URL
    window.addEventListener('hashchange', function() {
        const activeLink = document.querySelector('.aside .nav li a[href="' + window.location.hash + '"]');
        if (activeLink) {
            navLinks.forEach(link => link.classList.remove('active'));
            sections.forEach(section => section.classList.add('hidden'));
            
            activeLink.classList.add('active');
            const targetSection = document.querySelector(window.location.hash);
            targetSection.classList.remove('hidden');
        }
    });

    // On page load, show the section corresponding to the URL hash if present
    if (window.location.hash) {
        const initialActiveLink = document.querySelector('.aside .nav li a[href="' + window.location.hash + '"]');
        if (initialActiveLink) {
            initialActiveLink.classList.add('active');
            const targetSection = document.querySelector(window.location.hash);
            targetSection.classList.remove('hidden');
        }
    } else {
        // If there's no hash in the URL, show the home section by default
        document.querySelector('#home').classList.remove('hidden');
    }
});