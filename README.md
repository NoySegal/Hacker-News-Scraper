# Hacker News (simple) Scraper

This is a simple HN scraper which uses HTMLUnit as a Java headless browser, this allows performing HTTP requests on the website and parsing the HTML content.

This scraper only scrapes the first page, feel free to contribute to it.

### How to use
1. Download HTMLUnit library and add it to your project.
2. Add Scraper.java and HackerNewsItem to your project.
3. Use the API in HackerNewsItem.java to retrieve
    * the url of the post.
    * the title of the post.
    * the username of the poster.
    * the score of the post.
    * the position of the post.
    * the id of the post.


### Examples
In scraper.java I've implemented to print each scraped item like so:
```
HackerNewsItem{_title='Dutch scientists claim discovery of an antibody against Covid-19 (nos.nl)', _url='https://nos.nl/l/2327076', _author='TeeWEE', _score=110, _position=1, _id=22574211}
HackerNewsItem{_title='Gambas: Visual Basic on Linux (sourceforge.net)', _url='http://gambas.sourceforge.net/en/main.html', _author='galfarragem', _score=19, _position=2, _id=22574385}
HackerNewsItem{_title='Microsoft plots the end of Visual Basic (thurrott.com)', _url='https://www.thurrott.com/dev/232268/microsoft-plots-the-end-of-visual-basic', _author='bluedino', _score=408, _position=3, _id=22570684}
HackerNewsItem{_title='Pandemic Ventilator Project (panvent.blogspot.com)', _url='https://panvent.blogspot.com/', _author='mhb', _score=107, _position=4, _id=22573188}
HackerNewsItem{_title='Human Interface: Backpack harness innovation (carryology.com)', _url='https://www.carryology.com/liking/industry/human-interface-a-guide-to-backpack-harness-innovation/', _author='zdw', _score=87, _position=5, _id=22557640}
HackerNewsItem{_title='New paint atomizer with over 95% coating efficiency (global.toyota)', _url='https://global.toyota/en/newsroom/corporate/31587468.html', _author='clouddrover', _score=80, _position=6, _id=22572734}
HackerNewsItem{_title='SVT-AV1: open-source AV1 encoder and decoder (netflixtechblog.com)', _url='https://netflixtechblog.com/svt-av1-an-open-source-av1-encoder-and-decoder-ad295d9b5ca2', _author='CharlesW', _score=110, _position=7, _id=22572242}
HackerNewsItem{_title='Nvidia calling gaming PC owners to put their systems to work fighting Covid-19 (gamesradar.com)', _url='https://www.gamesradar.com/nvidias-calling-on-gaming-pc-owners-to-put-their-systems-to-work-fighting-covid-19/', _author='micael_dias', _score=40, _position=8, _id=22573984}
HackerNewsItem{_title='Wiring and Cabling: How to Lace Cable Harnesses (1962) (dairiki.org)', _url='http://www.dairiki.org/hammond/cable-lacing-howto/', _author='Lammy', _score=11, _position=9, _id=22573900}
HackerNewsItem{_title='MakerDAO gets stress tested as ETH price plummets (messari.io)', _url='https://messari.io/article/makerdao-gets-stress-tested-as-eth-price-plummets', _author='tlrobinson', _score=114, _position=10, _id=22562262}
...
```
