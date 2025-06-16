TRUNCATE projects RESTART IDENTITY;
INSERT INTO projects (title, description, skills, link, image_url)
VALUES
    (
        'Navigatio',
        'Our aim was to devlope a full fledged android application for the wanders who visits to an unknown city. Our application basically fetch the current location of the user and provide him/her a list of nearby utilities(parks, restaurant, coffee shops, atm''s etc) and provide him/her with the correct route to reach the destination.',
        'Android Studio, MySql, Java (For backend), Xml (For frontend), Firebase',
        'https://github.com/Anubhav007-hue/Navigatio',
        'images/navigatio.jpeg'
    ),
    (
        'Image Classifier',
        'This project is based on the object detection using CNN (Convulational Nueral Network). This model takes the input image from the user and classify its labels i.e to which class it belong from the classes which we have created and also tells the probablity of the existence.',
        'Juypter Notebook & GoogleCollab, Keras DataSet(cifas10), Testing images, AMD M5 430 GPU (For Faster Training)',
        'https://github.com/Anubhav007-hue/Image-Classifier',
        'images/image_classifier.jpeg'
    ),
    (
        'Memez',
        'Memez is an Android-based meme application that allows users to browse, generate, and share memes. The app fetches meme templates and content using various Google APIs, allowing users to create customized memes with ease.',
        'Android Studio, Google API',
        'https://github.com/Anubhav007-hue/Memezzz',
        'images/memez.jpeg'
    );
