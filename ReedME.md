<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Unknown | My Notebook Portfolio</title>
  <!-- Handwritten & Clean Fonts -->
  <link href="https://fonts.googleapis.com/css2?family=Caveat:wght@600;700&family=Patrick+Hand&family=Plus+Jakarta+Sans:wght@400;600;700&display=swap" rel="stylesheet">
  <style>
    :root {
      /* Your Cozy Library Palette + Inspo Notebook Colors */
      --bg-navy: #14244b;
      --bg-stripe: #192c59;
      --paper-cream: #fffdf7;
      --line-blue: #e3eaf2;
      --margin-red: #f2b5b5;
      --sage: #9CAF88;
      --tan: #D4A373;
      --espresso: #5C4D42;
      --brown: #8B6F5E;
      --ink: #2b2623;
    }

    * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
      scroll-behavior: smooth;
    }

    body {
      font-family: 'Plus Jakarta Sans', sans-serif;
      color: var(--ink);
      /* Striped Navy Background from your Inspo */
      background: repeating-linear-gradient(
        to bottom,
        var(--bg-navy),
        var(--bg-navy) 28px,
        var(--bg-stripe) 28px,
        var(--bg-stripe) 56px
      );
      padding: 40px 20px 80px;
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    .container {
      width: 100%;
      max-width: 920px;
    }

    /* Top Pill Badges */
    .top-badges {
      display: flex;
      flex-wrap: wrap;
      gap: 12px;
      margin-bottom: 16px;
    }

    .pill {
      padding: 8px 20px;
      border-radius: 999px;
      color: #fff;
      font-weight: 600;
      font-size: 0.95rem;
      box-shadow: 0 4px 10px rgba(0,0,0,0.2);
    }
    .pill.sage { background-color: var(--sage); }
    .pill.tan { background-color: var(--tan); }
    .pill.brown { background-color: var(--brown); }

    .main-title {
      color: #ffffff;
      font-size: 3rem;
      font-weight: 700;
      margin-bottom: 28px;
      letter-spacing: -0.5px;
    }

    /* Browser Window + Ruled Notebook Card */
    .notebook-window {
      background-color: var(--paper-cream);
      border-radius: 16px;
      overflow: hidden;
      box-shadow: 0 20px 40px rgba(0, 0, 0, 0.35);
      margin-bottom: 36px;
      position: relative;
    }

    /* Top Browser Bar */
    .browser-bar {
      background: #ffffff;
      padding: 12px 18px;
      display: flex;
      align-items: center;
      border-bottom: 3px solid #f5c242;
      gap: 16px;
    }

    .dots {
      display: flex;
      gap: 7px;
    }
    .dot { width: 12px; height: 12px; border-radius: 50%; }
    .dot.red { background: #ff5f56; }
    .dot.yellow { background: #ffbd2e; }
    .dot.green { background: #27c93f; }

    .url-bar {
      flex: 1;
      height: 22px;
      background: #f1f3f5;
      border-radius: 6px;
      max-width: 500px;
      margin: 0 auto;
    }

    /* Ruled Paper Area */
    .paper-content {
      position: relative;
      padding: 28px 40px 44px 95px;
      /* Horizontal Notebook Lines */
      background-image: repeating-linear-gradient(
        to bottom,
        transparent 0px,
        transparent 31px,
        var(--line-blue) 32px
      );
      line-height: 32px;
    }

    /* Vertical Pink Margin Line */
    .paper-content::before {
      content: "";
      position: absolute;
      top: 0;
      bottom: 0;
      left: 72px;
      width: 2px;
      background-color: var(--margin-red);
    }

    /* Binder Punch Hole */
    .punch-hole {
      position: absolute;
      left: 26px;
      width: 22px;
      height: 22px;
      background-color: var(--bg-navy);
      border-radius: 50%;
      box-shadow: inset 0 2px 4px rgba(0,0,0,0.4);
    }
    .hole-top { top: 45px; }
    .hole-bottom { bottom: 65px; }

    /* Notebook Navbar */
    .nav-header {
      display: flex;
      justify-content: space-between;
      align-items: center;
      flex-wrap: wrap;
      margin-bottom: 24px;
    }

    .brand {
      font-family: 'Caveat', cursive;
      font-size: 1.8rem;
      font-weight: 700;
      color: var(--espresso);
    }

    .nav-links {
      display: flex;
      gap: 18px;
      font-family: 'Patrick Hand', cursive;
      font-size: 1.15rem;
    }

    .nav-links a {
      text-decoration: none;
      color: var(--ink);
    }
    .nav-links a:hover {
      color: var(--tan);
      text-decoration: underline;
    }

    .date-stamp {
      text-align: right;
      font-family: 'Patrick Hand', cursive;
      color: #8c7a6b;
      font-size: 0.95rem;
      margin-bottom: 8px;
    }

    /* Hero Section Grid */
    .hero-grid {
      display: grid;
      grid-template-columns: 1.3fr 0.9fr;
      gap: 30px;
      align-items: center;
    }

    .greeting {
      font-family: 'Patrick Hand', cursive;
      font-size: 1.35rem;
      color: #4a5568;
    }

    .hero-name {
      font-family: 'Caveat', cursive;
      font-size: 3.6rem;
      font-weight: 700;
      line-height: 1.1;
      margin: 4px 0 18px;
      display: inline-block;
      border-bottom: 3px solid #e05252; /* Red underline from inspo */
      padding-bottom: 4px;
    }

    .bio-bullets {
      list-style: none;
      font-family: 'Patrick Hand', cursive;
      font-size: 1.25rem;
      margin-bottom: 24px;
    }

    .bio-bullets li {
      margin-bottom: 6px;
    }

    /* Action Buttons */
    .cta-group {
      display: flex;
      gap: 14px;
      flex-wrap: wrap;
      margin-bottom: 24px;
    }

    .btn-primary {
      background-color: var(--brown);
      color: #fff;
      padding: 10px 24px;
      border-radius: 8px;
      text-decoration: none;
      font-family: 'Patrick Hand', cursive;
      font-size: 1.15rem;
      transition: transform 0.15s;
    }
    .btn-primary:hover { transform: translateY(-2px); }

    .btn-dashed {
      border: 2px dashed var(--brown);
      color: var(--espresso);
      padding: 8px 22px;
      border-radius: 8px;
      text-decoration: none;
      font-family: 'Patrick Hand', cursive;
      font-size: 1.15rem;
      background: rgba(255,255,255,0.6);
    }
    .btn-dashed:hover { background: #fff; }

    .mini-socials {
      font-family: 'Patrick Hand', cursive;
      font-size: 1.1rem;
      color: var(--espresso);
    }
    .mini-socials a {
      color: var(--espresso);
      text-decoration: none;
      margin: 0 6px;
    }
    .mini-socials a:hover { text-decoration: underline; }

    /* Polaroid Frame */
    .polaroid-wrapper {
      position: relative;
      display: flex;
      justify-content: center;
    }

    .polaroid {
      background: #ffffff;
      padding: 14px 14px 36px;
      border-radius: 4px;
      box-shadow: 0 10px 25px rgba(0,0,0,0.15);
      transform: rotate(3deg);
      position: relative;
      max-width: 240px;
      text-align: center;
    }

    /* Yellow Washi Tape */
    .polaroid::before {
      content: "";
      position: absolute;
      top: -12px;
      left: 50%;
      transform: translateX(-50%) rotate(-2deg);
      width: 75px;
      height: 22px;
      background-color: rgba(247, 224, 114, 0.85);
      box-shadow: 0 1px 3px rgba(0,0,0,0.1);
    }

    .polaroid img {
      width: 100%;
      height: 220px;
      object-fit: cover;
      border-radius: 2px;
      background: #e6ccb2;
    }

    .polaroid-caption {
      font-family: 'Caveat', cursive;
      font-size: 1.35rem;
      margin-top: 8px;
      color: var(--ink);
    }

    /* Section Headings on Page 2 */
    .section-title {
      font-family: 'Caveat', cursive;
      font-size: 2.6rem;
      color: var(--espresso);
      display: inline-block;
      border-bottom: 3px solid var(--sage);
      margin-bottom: 16px;
    }

    .two-col {
      display: grid;
      grid-template-columns: 1.4fr 1fr;
      gap: 32px;
    }

    .hand-text {
      font-family: 'Patrick Hand', cursive;
      font-size: 1.2rem;
    }

    /* Sticky Note Card for Bookshelf/Tools */
    .sticky-card {
      background: #fff9db;
      border: 1px solid #f0e1a0;
      border-radius: 8px;
      padding: 18px;
      box-shadow: 4px 6px 12px rgba(0,0,0,0.06);
      font-family: 'Patrick Hand', cursive;
    }

    .sticky-card h3 {
      font-family: 'Caveat', cursive;
      font-size: 1.7rem;
      color: var(--espresso);
      margin-bottom: 8px;
    }

    .tool-tags {
      display: flex;
      flex-wrap: wrap;
      gap: 8px;
      margin-top: 8px;
    }

    .tool-tag {
      background: var(--tan);
      color: #fff;
      padding: 2px 12px;
      border-radius: 6px;
      font-size: 1rem;
    }
    .tool-tag.sage { background: var(--sage); }
    .tool-tag.brown { background: var(--brown); }

    /* Lab Tasks Table */
    .lab-table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 16px;
      font-family: 'Patrick Hand', cursive;
      font-size: 1.15rem;
      background: rgba(255, 255, 255, 0.7);
    }

    .lab-table th, .lab-table td {
      border: 1px solid #d8cfc4;
      padding: 8px 14px;
      text-align: left;
    }

    .lab-table th {
      background-color: #f3ece1;
      color: var(--espresso);
    }

    .lab-table a {
      color: var(--brown);
      font-weight: bold;
    }

    @media (max-width: 768px) {
      .hero-grid, .two-col { grid-template-columns: 1fr; }
      .paper-content { padding: 24px 20px 36px 55px; }
      .paper-content::before { left: 40px; }
      .punch-hole { left: 10px; }
    }
  </style>
</head>
<body>

  <div class="container">
    <!-- Top Pill Badges -->
    <div class="top-badges">
      <span class="pill sage">BSIT 1st Year</span>
      <span class="pill tan">Web Dev</span>
      <span class="pill brown">Reading & Coding</span>
    </div>

    <h1 class="main-title">My Portfolio</h1>

    <!-- WINDOW 1: HERO SECTION -->
    <div class="notebook-window" id="home">
      <div class="browser-bar">
        <div class="dots">
          <span class="dot red"></span>
          <span class="dot yellow"></span>
          <span class="dot green"></span>
        </div>
        <div class="url-bar"></div>
      </div>

      <div class="paper-content">
        <div class="punch-hole hole-top"></div>
        <div class="punch-hole hole-bottom"></div>

        <nav class="nav-header">
          <div class="brand">My.Notebook 🧺</div>
          <div class="nav-links">
            <a href="#home">Home</a>
            <a href="#about">About</a>
            <a href="#bookshelf">Bookshelf</a>
            <a href="#labs">Lab Tasks</a>
            <a href="#contact">Contact</a>
          </div>
        </nav>

        <div class="date-stamp">Chapter 1 · 2026</div>

        <div class="hero-grid">
          <div>
            <p class="greeting">Hello there! 👋</p>
            <h2 class="hero-name">I'm Unknown ੯‧̀͡⬮</h2>

            <ul class="bio-bullets">
              <li>✍️ A passionate <strong>BSIT student</strong> quietly coding in the corner of the library.</li>
              <li>📖 Learning the basics of <strong>web development</strong>, one line at a time.</li>
            </ul>

            <div class="cta-group">
              <a href="#labs" class="btn-primary">View Lab Tasks →</a>
              <a href="#contact" class="btn-dashed">Leave a Note ✉️</a>
            </div>

            <div class="mini-socials" id="contact">
              <a href="https://github.com/YOUR_USERNAME" target="_blank">GitHub</a> •
              <a href="mailto:YOUR_EMAIL@gmail.com">Gmail</a> •
              <a href="https://www.instagram.com/YOUR_USERNAME" target="_blank">Instagram</a>
            </div>
          </div>

          <!-- Polaroid Card -->
          <div class="polaroid-wrapper">
            <div class="polaroid">
              <!-- Replace src with your avatar or Snoopy image -->
              <img src="snoopy%20pic_1500x500.jpg" alt="Profile Polaroid">
              <div class="polaroid-caption">That's me! 😊</div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- WINDOW 2: ABOUT, BOOKSHELF & LAB TASKS -->
    <div class="notebook-window" id="about">
      <div class="browser-bar">
        <div class="dots">
          <span class="dot red"></span>
          <span class="dot yellow"></span>
          <span class="dot green"></span>
        </div>
        <div class="url-bar"></div>
      </div>

      <div class="paper-content">
        <div class="punch-hole hole-top"></div>
        <div class="punch-hole hole-bottom"></div>

        <div class="two-col">
          <div>
            <h2 class="section-title">About Me</h2>
            <p class="hand-text">
              Hi there! I'm <strong>Unknown</strong>, a first-year <strong>BS Information Technology (Web Development)</strong> student who loves cozy aesthetics, good books, and building clean things for the web.
            </p>
            <br>
            <p class="hand-text">
              Right now, my repository is like a freshly opened notebook—filled with beginner experiments, class exercises, and small steps toward becoming a better developer.
            </p>
          </div>

          <!-- Bookshelf & Tools Sticky Note -->
          <div class="sticky-card" id="bookshelf">
            <h3>🪵 Bookshelf & Tools</h3>
            <p><strong>Languages & Web Basics:</strong></p>
            <div class="tool-tags">
              <span class="tool-tag">HTML5</span>
              <span class="tool-tag sage">CSS3</span>
              <span class="tool-tag brown">JavaScript</span>
            </div>
            <br>
            <p><strong>Workspace:</strong></p>
            <div class="tool-tags">
              <span class="tool-tag brown">VS Code</span>
              <span class="tool-tag sage">GitHub</span>
            </div>
          </div>
        </div>

        <br>

        <!-- Lab Tasks Archive -->
        <div id="labs">
          <h2 class="section-title">🗂️ Lab Tasks Archive</h2>
          <table class="lab-table">
            <thead>
              <tr>
                <th>Task</th>
                <th>Topic / Description</th>
                <th>Link</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td><strong>Lab Task 01</strong></td>
                <td>Basic HTML structure & semantic page layout</td>
                <td><a href="YOUR_LINK_HERE">View</a></td>
              </tr>
              <tr>
                <td><strong>Lab Task 02</strong></td>
                <td>CSS styling, typography & color palettes</td>
                <td><a href="YOUR_LINK_HERE">View</a></td>
              </tr>
              <tr>
                <td><strong>Lab Task 03</strong></td>
                <td>Coming soon...</td>
                <td>—</td>
              </tr>
            </tbody>
          </table>
        </div>

      </div>
    </div>
  </div>

</body>
</html>
