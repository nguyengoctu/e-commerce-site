$(function () {
    switch (menubar) {
        case 'About us':
            $('#about').addClass('active');
            break;
        case 'Contact us':
            $('#contact').addClass('active');
            break;
        case 'Products':
            $('#products').addClass('active');
            break;
        default:
            $('#products').addClass('active');
            $('#' + menubar.replace(/ /g,'')).addClass('active');
            break;
    }
});