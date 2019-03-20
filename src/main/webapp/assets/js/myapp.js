$(function () {
    switch (menubar) {
        case 'About us':
            $('#about').addClass('active');
            break;
        case 'Contact us':
            $('#contact').addClass('active');
            break;
        default:
            $('#home').addClass('active');
            break;
    }
})